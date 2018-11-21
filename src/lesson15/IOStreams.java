package lesson15;

//io api

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Vector;

public class IOStreams {
//    InputStream
//    OutputStream - nи тот, и другой работают с байтами

    private long readByte(File file) throws IOException {
        long byteSum = 0;
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            System.out.println(fileInputStream.available());
            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                byteSum += data;
                System.out.println((char) data);
            }
            return byteSum;
        }

    }

    private void readByteArray(File file, Charset charset) throws IOException { // Charset - кодировка
        try (InputStream in = new FileInputStream(file); ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
                System.out.println(Arrays.toString(buf));
                byteArrayOutputStream.write(buf, 0, len);
            }
            System.out.println(Arrays.toString(byteArrayOutputStream.toByteArray()));
            System.out.println(new String(byteArrayOutputStream.toByteArray(), charset));
        }
    }

    private void writeToFile(File file, boolean append, Charset charset) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file, append)) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                sb.append("line ").append(i).append('\n');
            }
            byte[] bytes = sb.toString().getBytes(charset);
            fileOutputStream.write(bytes);
        }
    }

    public void writeWithBuffer(File file) throws IOException {
        try (
                FileOutputStream out = new FileOutputStream(file);
                BufferedOutputStream bout = new BufferedOutputStream(out);
        ) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 10; i++) {
                sb.append("line ").append(i).append('\n');
            }
            byte[] buffer = sb.toString().getBytes();
            bout.write(buffer, 0, buffer.length);
        }
    }

    private void readFromTwoFiles(File[] files, Charset charset) throws IOException {
        try (
                InputStream input1 = new FileInputStream(files[0]);
                InputStream input2 = new FileInputStream(files[1]);
                ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ) {

//            Несколько потоков последовательно:
//            InputStream in1 = new FileInputStream("file1.txt");
//            InputStream in2 = new FileInputStream("file2.txt");
//            InputStream in3 = new FileInputStream("file3.txt");
//
//            Vector<InputStream> streams = new Vector<>();
//            streams.add(in1);
//            streams.add(in2);
//            streams.add(in3);
//            SequenceInputStream sequenceInputStream = new SequenceInputStream(streams.elements());

            SequenceInputStream sequenceInputStream = new SequenceInputStream(input1, input2);
            byte[] buf = new byte[1024];
            int len;
            while ((len = sequenceInputStream.read(buf)) > 0) {
                bout.write(buf, 0, len);
            }
            System.out.println(new String(bout.toByteArray(), charset));
        }
    }

    private static void dataOutput(OutputStream out) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(out);
        dataOutputStream.writeInt(12);
        dataOutputStream.writeBoolean(true);
        dataOutputStream.writeUTF("Hello");
    }

    private static void dataInput(InputStream in) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(in);
        int i = dataInputStream.readInt();
        boolean b = dataInputStream.readBoolean();
        String str = dataInputStream.readUTF();

        System.out.printf("%s %s %s", str, i, b);
//        System.out.printf("%s", i);
    }

    public String readURL(String url, Charset charset) throws IOException {
        HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
        con.setRequestProperty("Accept-Charse", charset.name());

        try (InputStream in = con.getInputStream()) {
            return readText(in, charset);
        }
    }

    private String readText(InputStream in, Charset charset) throws IOException {
        InputStreamReader reader = new InputStreamReader(in, charset);
        StringBuilder sb = new StringBuilder();
        char[] buf = new char[20];
        int len;
        while ((len = reader.read(buf)) > 0) {
            sb.append(buf, 0, len);
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
//        PipedInputStream pipedInputStream;
//        PipedOutputStream pipedOutputStream; - для многопоточной среды, работают в паре

//        FilterInputStream filterInputStream; - можно переопределить метод read, для расширения функционала чтения из файла
//        FilterOutputStream filterOutputStream;


        IOStreams ioStreams = new IOStreams();
//        чтение из файла по байту
        File file = new File("file.txt");
        File file2 = new File("file2.txt");
//        System.out.println(ioStreams.readByte(file));
//        ioStreams.readByteArray(file, Charset.forName("UTF-8"));
//        ioStreams.writeToFile(file, false, Charset.forName("UTF-8"));
//        ioStreams.writeWithBuffer(file);
//        File[] files = {file, file2};
//        ioStreams.readFromTwoFiles(files, Charset.forName("UTF-8"));
//
//        try (OutputStream out = new FileOutputStream(file)) {
//            dataOutput(out);
//        }
//        try (InputStream in = new FileInputStream(file)) {
//            dataInput(in);
//        }

        String str = ioStreams.readURL("https://en.wikipedia.org/wiki/Uniform_Resource_Identifier", Charset.forName("UTF-8"));
        System.out.println(str);
    }
}
