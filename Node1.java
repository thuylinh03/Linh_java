import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Node1{
    private int id;
    private double trong_so;

    public Node1(){

    }

    public Node1(int id, double trong_so) {
        this.id = id;

        this.trong_so = trong_so;
    }

    public int getID(){
        return id;
    }



    public void setID(int id){
        this.id = id;
    }







    public double getTrong_so() {
        return trong_so;
    }



    public void setTrong_so(double trong_so) {
        this.trong_so = trong_so;
    }

    public static void main(String[] args){
        List<Node1> list = new Vector<Node1>();
        //ArrayList<Node1> allNode = new ArrayList<Node1>();
        try{
            File x = new File("data.txt");
            Scanner sc = new Scanner(x);
            String line = "";
            sc.hasNextLine();
            while(sc.hasNextLine()){
                Node1 n = new Node1();
                //Node1 n;
                line += sc.nextLine()+"\r\n";
                //Integer.parseInt(line)
                n.id = Integer.parseInt(line);
                line += sc.nextLine()+"\r\n";
                n.trong_so = Double.parseDouble(line);
                list.add(n);
            }
            System.out.println(line);
            sc.close();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        // Node1 n;
        // int nodeID;
        // double min_kc = 999;
        // int min_id = 999;
        // for (int i=0; i<list.size(); i++) {
        //     if(nodeID == n.id){
        //         continue;
        //     }
        //     double kc = Math.sqrt((n.x-nodeID.x)*(n.x-nodeID.x)+(n.y-nodeID.y)*(n.y-nodeID.y));
        //     if(kc<min_kc){
        //         min_kc=kc;
        //         min_id=nodeID.id;
        //     }
        // }
    }
}