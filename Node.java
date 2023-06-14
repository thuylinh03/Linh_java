import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Node {
    private int canh;
    private int dinh;
    private int trong_so;
    
    public Node(){}

    public Node(int canh, int dinh, int trong_so) {
        this.canh = canh;
        this.dinh = dinh;
        this.trong_so = trong_so;
    }

    public int getCanh() {
        return canh;
    }

    public void setCanh(int canh) {
        this.canh = canh;
    }

    public int getDinh() {
        return dinh;
    }

    public void setDinh(int dinh) {
        this.dinh = dinh;
    }

    public int getTrong_so() {
        return trong_so;
    }

    public void setTrong_so(int trong_so) {
        this.trong_so = trong_so;
    }

    public void find(){

    }

    static void usingThreadLocalClass(){
        for(int i=0; i<5; i++){
            int w = ThreadLocalRandom.current().nextInt(0,2);
            System.out.println(w);
        }


        // int w = ThreadLocalRandom.current().nextInt(0,2);
        // System.out.println(w);
    }
    public static void main(String[] args) throws IOException {
        ArrayList<Node> allNode = new ArrayList<Node>();
        // usingThreadLocalClass();

        try{
            File x = new File("data.txt");
            Scanner sc = new Scanner(x);
            String line = "";
            sc.hasNextLine();
            while(sc.hasNextLine()){
                Node n = new Node() ;
                line += sc.nextLine()+"\r\n";
                n.canh = Integer.parseInt(line);
                line += sc.nextLine()+"\r\n";
                n.dinh = Integer.parseInt(line);
                line += sc.nextLine()+"\r\n";
                n.trong_so = Integer.parseInt(line);
                allNode.add(n);
            }
            System.out.println(line);
            sc.close();
        } catch(FileNotFoundException e){
            System.out.println("Error");
        }

        // for (Node node : allNode) {
            
        // }
        
        
    }
}
