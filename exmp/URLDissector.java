import java.util.Scanner;
import java.io.*;
public class URLDissector
{
public static void main (String[] args) throws IOException
{
String url;
Scanner fileScan, urlScan;
fileScan = new Scanner (new File("websites.inp"));
while (fileScan.hasNext()) // Read and process each line of the file
{
url = fileScan.nextLine();
System.out.println ("URL: " + url);
urlScan = new Scanner (url);
urlScan.useDelimiter("/");
while (urlScan.hasNext()) //  Print each part of the url
System.out.println ("   " + urlScan.next());
System.out.println();
}
}
}
