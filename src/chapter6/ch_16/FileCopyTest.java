package chapter6.ch_16;

import java.io.*;
import java.net.Socket;

public class FileCopyTest {

    public static void main(String[] args) throws IOException {

        long millisecond = 0;

        try(FileInputStream fis = new FileInputStream("a.zip");
            FileOutputStream fos = new FileOutputStream("copy.zip")){

            millisecond = System.currentTimeMillis();

            int i;
            while( (i = fis.read()) != -1 ){
                fos.write(i);
            }

            millisecond = System.currentTimeMillis() - millisecond;

        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println(millisecond + "소요되었습니다.");

        Socket socket = new Socket();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        br.readLine();
    }
}
