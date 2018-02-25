package com.liguo.www;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


import java.io.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

/**
 * @Author liguo
 * @Description
 * @Data 2018-02-18 1:20
 */


public class ForFile {
    public static String name;
    public static String myname;
    public static String str;
    /**
     * 文件的读取
     * @param filePath
     * @throws IOException
     */
    public static void readF1(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(filePath)));

        for (String line = br.readLine(); 
             line != null;
             line = br.readLine()) {
            String newstr = line;
            String wenyi = newstr;
            String wenyi1 = wenyi.replaceAll( "你",name+"你");
            String weny2 = wenyi1.replaceAll( "大家",name );
            String wenyi3 = weny2.replaceAll( "各位",name );
            System.out.println(wenyi3);
            
        }
        br.close();

    }
    public static  void readF2(String filePath) throws IOException {
        FileReader fr = new FileReader(filePath);
        BufferedReader bufferedreader = new BufferedReader(fr);
        String instring;
        while ((instring = bufferedreader.readLine().trim()) != null) {
            if (0 != instring.length()) {
                System.out.println(instring);
            }
        }
        fr.close();
    }
    //生成文件路径
    private static String path = "C:\\Users\\ligou\\Desktop\\Festival Greetings\\对某人的祝福\\" ;

    //文件路径+名称
    private static String filenameTemp;
    /**
     * 创建文件
     * @param fileName  文件名称
     * @param filecontent   文件内容
     * @return  是否创建成功，成功则返回true
     */
    public static boolean createFile(String fileName,String filecontent){
        Boolean bool = false;
        filenameTemp = fileName+".txt";//文件路径+名称+文件类型
        File file = new File(filenameTemp);
        try {
            //如果文件不存在，则创建新的文件
            if(!file.exists()){
                file.createNewFile();
                bool = true;
                System.out.println("success create file,the file is "+filenameTemp);
                //创建文件成功后，写入内容到文件里
                writeFileContent(filenameTemp, filecontent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return bool;
    }

    /**
     * 向文件中写入内容
     * @param filepath 文件路径与名称
     * @param newstr  写入的内容
     * @return
     * @throws IOException
     */
    public static boolean writeFileContent(String filepath,String newstr) throws IOException{
        Boolean bool = false;
        String filein = newstr+"\r\n";//新写入的行，换行
        String temp  = "";

        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        FileOutputStream fos  = null;
        PrintWriter pw = null;
        try {
            File file = new File(filepath);//文件路径(包括文件名称)
            //将文件读入输入流
            fis = new FileInputStream(file);
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            StringBuffer buffer = new StringBuffer();

            //文件原有内容
            for(int i=0;(temp =br.readLine())!=null;i++){
                buffer.append(temp);
                // 行与行之间的分隔符 相当于“\n”
                buffer = buffer.append(System.getProperty("line.separator"));
            }
            buffer.append(filein);

            fos = new FileOutputStream(file);
            pw = new PrintWriter(fos);
            pw.write(buffer.toString().toCharArray());
            pw.flush();
            bool = true;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally {
            //不要忘记关闭
            if (pw != null) {
                pw.close();
            }
            if (fos != null) {
                fos.close();
            }
            if (br != null) {
                br.close();
            }
            if (isr != null) {
                isr.close();
            }
            if (fis != null) {
                fis.close();
            }
        }
        return bool;
    }

    /**
     * 删除文件
     * @param fileName 文件名称
     * @return
     */
    public static boolean delFile(String fileName){
        Boolean bool = false;
        filenameTemp = path+fileName+".txt";
        File file  = new File(filenameTemp);
        try {
            if(file.exists()){
                file.delete();
                bool = true;
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return bool;
    }

    public void time(){
        try {
            System.out.println( ); System.out.println( ); System.out.println( ); System.out.println( ); System.out.println( ); System.out.println( ); System.out.println( );

//        Calendar now =Calendar.getInstance();
//        SimpleDateFormat sdf =new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
//     System.out.println("现在是"+now.getTime().toString());
//        System.out.println("现在是"+sdf.format(now));
//                String date =  sdf.format(now);
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            long know = System.currentTimeMillis();
            Date d3 = new Date( know );
//      System.out.println(df.format( d3 ));
            String d4 = df.format( d3 );
            Date d1 = df.parse("2018-02-16 00:00:00");
            Date d2 = df.parse(d4 );
            long diff = d2.getTime() - d1.getTime() ;
            long days = diff / (1000 * 60 * 60 * 24);
            long hours = (diff-days*(1000 * 60 * 60 * 24))/(1000* 60 * 60);
            long minutes = (diff-days*(1000 * 60 * 60 * 24)-hours*(1000* 60 * 60))/(1000* 60);
            System.out.println("2018年农历戊戌年(狗年)刚");
            System.out.print(days+"天"+hours+"小时"+minutes+"分");
            System.out.println("");
        }catch(Exception exception){}
    }
    public void printout1(){

        /**
         * 输出的字符
         */
        System.out.println("请允许"+myname+"用24种编程语言，向"+name+"送去祝福……");
        System.out.println("C：printf(\"祝"+name+"新年快乐\");");
        System.out.println("C++:cout<<\"祝"+name+"新年快乐\";");
        System.out.println("java:System.out.println(\"祝"+name+"新年快乐\");");
        System.out.println("Python:print(\"祝"+name+"新年快乐！\")");
        System.out.println("QBasic:Print\"祝"+name+"新年快乐\"");
        System.out.println("Asp:Response.Write\"祝"+name+"新年快乐\"");
        System.out.println("PHP:echo\"祝"+name+"新年快乐\";");
        System.out.println("JScript:alert(\"祝"+name+"新年快乐\")");
        System.out.println("VBScript:MsgBox\"祝"+name+"新年快乐\"");
        System.out.println("Jscript:document.write(\"祝"+name+"新年快乐\")");
        System.out.println("Delphi:ShowMessage('祝"+name+"新年快乐！');");
        System.out.println("VB:Print\"祝"+name+"新年快乐！\"");
        System.out.println("VC:MessageBox(\"祝"+name+"新年快乐！\");");
        System.out.println("shell:echo祝"+name+"新年快乐");
        System.out.println("perl:print'祝"+name+"狗年快乐'");
        System.out.println("powerBuilder:messagebox（\"祝"+name+"新年快乐\")");
        System.out.println("C#：System.Console.WriteLine(\"祝"+name+"新年快乐!\")");
        System.out.println("COBOL:DISPLAY'祝"+name+"新年快乐！");
        System.out.println("AS:Alert.show(\"祝"+name+"新年快乐！\");");
        System.out.println("Foxpro:?[祝"+name+"新年快乐！]");
        System.out.println("DOS批处理:echo祝"+name+"新年快乐");
        System.out.println("易语言:调试输出(“祝"+name+"新年快乐！！！”)");
        System.out.println(" iapp：tw(\"祝"+name+"新年快乐\")");
        System.out.println("html： <br/>☆祝"+name+"新年快乐！狗年旺旺旺☆<br/>");
    }
    public static void main(String[] args) {
//        Main happy =new Main();
//        /**
//         * 输入模块
//         */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入发送祝福人的姓名:");
//        happy.name = scanner.next();
//        System.out.println("请输入别人对自己的称谓");
//        happy.myname = scanner.next();
//        happy.time();
//        happy.printout2();
//        String name = "妈妈";
//        String wenyi = "“愿你有高跟鞋也有跑鞋，喝茶也喝酒。愿你有勇敢的朋友，有牛逼的对手。愿你对过往的一切情深意重，但从不回头。愿你特别美丽，特别平静，特别凶狠，也特别温柔。”新年愿你 有盔甲，也有软肋。心中有傲骨，也有慈悲。有披着星辰黑着眼眶的夜，也有说走就走随时出发的旅程。" ;
//        String wenyi1 = wenyi.replaceAll( "你",name+"你");
//        String wenyi2 = wenyi.replaceAll( "大家",name );

//        System.out.println(wenyi2);
//
//        ForFile one= new ForFile();
//
//
//        one.createFile("生成的新春祝福"+"myfile", "wenyi2");
//        one.writeFileContent("C:\\Users\\ligou\\Desktop" ,wenyi2 )
        ForFile files =new ForFile();

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入发送祝福人的姓名:");
        files.name = scanner.next();
        System.out.println("请输入别人对自己的称谓");
        files.myname = scanner.next();
        files.time();


        try {
            files.readF1( "C:\\Users\\ligou\\Desktop\\Festival Greetings\\祝福语句.txt" );
        } catch (IOException e) {
            e.printStackTrace();
        }
        files.printout1();
        UUID uuid = UUID.randomUUID();
        createFile(uuid+name, str);
    }
}