package kynnseed;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Kynseed {
    public static void main(String[] args) {
        String sourceDir = "C:\\game\\Kynseed v1.1.1.12081\\Kynseed v1.1.1.12081\\Saves";
        String destDir = "\\\\192.168.1.215\\share\\torrent\\kynnseed_sava";

        File sourceFolder = new File(sourceDir);

        if (!sourceFolder.exists()) {
            System.out.println("Source directory does not exist.");
            return;
        }

        // 날짜와 시간으로 폴더 이름 생성
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        File destFolder = new File(destDir, timestamp);

        if (!destFolder.exists()) {
            destFolder.mkdirs();
        }

        try {
            copyFolder(sourceFolder, destFolder);
            System.out.println("Files copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
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
                System.out.print("Copying " + source.getName() + ": " + progress + "%\r");
            }
        }

        System.out.println("Copying " + source.getName() + ": Complete");
    }
}
