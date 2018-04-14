import java.util.*;
import java.io.*;

public class UT_Plus2args {
        public static void main (String[] args) {
                Test_Normal();
                System.exit(0);
        }

        public static void Test_Normal() {
                String command = "java /home/nishilab/shibasaki/develop/UT/java/jenbin/Plus2args 6 9";
                Runtime runtime = Runtime.getRuntime();
                try {
                        //クラスファイルの実行、および実行完了まで待機
                        Process process = runtime.exec(command);
                        int exitValue = process.waitFor();
                }

                catch(IOException e) {
                        System.out.println("Test_Normal execuing error. IOException.");
                        System.exit(1);
                }
                catch(InterruptedException e) {
                        System.out.println("Test_Normal execuing error. InterruptedException.");
                        System.exit(1);
                }

                finally{
                }
                //正常終了確認用メッセージ
                System.out.println("Test_Normal executed.");
        }
}