package kynnseed;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RestoreKynnseed {
    public static void main(String[] args) {
        String sourceDirParent = "\\\\192.168.1.215\\share\\torrent\\kynnseed_sava"; // 원본 디렉토리의 부모 디렉토리
        String destDir = "C:\\game\\Kynseed v1.1.1.12081\\Kynseed v1.1.1.12081\\Saves"; // 복사될 목적지 디렉토리

        File parentFolder = new File(sourceDirParent);
        if (!parentFolder.exists() || !parentFolder.isDirectory()) {
            System.out.println("Source parent directory does not exist or is not a directory.");
            return;
        }

        File latestFolder = getLatestFolder(parentFolder);
        if (latestFolder == null) {
            System.out.println("No valid subfolders found in the source parent directory.");
            return;
        }

        File destFolder = new File(destDir);
        if (!destFolder.exists()) {
            destFolder.mkdirs();
        }

        try {
            copyFolder(latestFolder, destFolder);
            System.out.println("Files restored successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static File getLatestFolder(File parentFolder) {
        File[] subFolders = parentFolder.listFiles(File::isDirectory);
        if (subFolders == null || subFolders.length == 0) {
            return null;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
        File latestFolder = null;
        Date latestDate = null;

        for (File folder : subFolders) {
            try {
                Date folderDate = sdf.parse(folder.getName());
                if (latestDate == null || folderDate.after(latestDate)) {
                    latestDate = folderDate;
                    latestFolder = folder;
                }
            } catch (ParseException e) {
                // 무시하고 다음 폴더로 이동
            }
        }

        return latestFolder;
    }

    public static void copyFolder(File source, File dest) throws IOException {
        if (source.isDirectory()) {
            if (!dest.exists()) {
                dest.mkdir();
            }

            String[] children = source.list();
            for (String child : children) {
                copyFolder(new File(source, child), new File(dest, child));
            }
        } else {
            copyFileWithProgress(source, dest);
        }
    }

    public static void copyFileWithProgress(File source, File dest) throws IOException {
        long totalBytes = source.length();
        long copiedBytes = 0;

        try (FileInputStream in = new FileInputStream(source);
             FileOutputStream out = new FileOutputStream(dest)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
                copiedBytes += length;
                int progress = (int) ((copiedBytes * 100) / totalBytes);
                System.out.print("Restoring " + source.getName() + ": " + progress + "%\r");
            }
        }

        System.out.println("Restoring " + source.getName() + ": Complete");
    }
}
