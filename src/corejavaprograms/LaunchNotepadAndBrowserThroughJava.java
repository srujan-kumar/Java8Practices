package corejavaprograms;

import java.io.IOException;

public class LaunchNotepadAndBrowserThroughJava {
    public static void main(String[] args) throws InterruptedException, IOException {
        Runtime runTime=Runtime.getRuntime();
        //notepad launch
        Process pr=runTime.exec("notepad.exe C:\\Users\\Srujan_Kundurthi\\Desktop\\demo.txt");
        Thread.sleep(4000);
        pr.destroy();

        // Chrome Browser
        String st[]=new String[]{"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "https://google.com"};
        runTime.exec(st);

    }
}
