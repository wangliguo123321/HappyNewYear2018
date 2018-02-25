package com.liguo.www;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {


    public String name;
    public String myname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMyname() {
        return myname;
    }

    public void setMyname(String myname) {
        this.myname = myname;
    }

    public void input(){


    }
    public void printout2(){
        String wenyi = "“愿你有高跟鞋也有跑鞋，喝茶也喝酒。愿你有勇敢的朋友，有牛逼的对手。愿你对过往的一切情深意重，但从不回头。愿你特别美丽，特别平静，特别凶狠，也特别温柔。”新年愿你 有盔甲，也有软肋。心中有傲骨，也有慈悲。有披着星辰黑着眼眶的夜，也有说走就走随时出发的旅程。" ;
        String wenyi1 = wenyi.replaceAll( "你",name+"你");
        String wenyi2 = wenyi.replaceAll( "大家",name );
        System.out.println(wenyi2);
        System.out.println("\n\n\n\n\n\n\n\n\n");


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



    public void getnumber(int a){
        String newstr = "";
        String wenyi = newstr;
        String wenyi1 = wenyi.replaceAll( "你",name+"你");
        String weny2 = wenyi1.replaceAll( "大家",name );
        String wenyi3 = weny2.replaceAll( "各位",name );
        System.out.println(wenyi3);
        System.out.println("\n\n\n\n\n\n\n\n\n");


    }

    public static void main(String[] args) {
        Main happy =new Main();
        /**
         * 输入模块
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入发送祝福人的姓名:");
        happy.name = scanner.next();
        System.out.println("请输入别人对自己的称谓");
        happy.myname = scanner.next();
        happy.time();
        happy.printout2();
    }
}

