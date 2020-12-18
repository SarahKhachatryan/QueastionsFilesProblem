import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
      String fileName = "C:\\Users\\PC\\Desktop\\Questions.txt";
        HashMap<String,  HashSet<String>> map = new HashMap<String, HashSet<String>>();
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        StringBuffer sb = new StringBuffer();
        String line;
        while ((line = br.readLine()) != null) {

            sb.append(line);
            sb.append("\n");
        }
        fr.close();
        String[] arr= sb.toString().split("\n");
        for(int i=0;i<arr.length;i++)
        {
            String[] q = arr[i].split(":");
           HashSet<String> hset= new HashSet<>();
            map.put(q[0],hset);
            //map.get(q[0]).add(q[1]);
        }
        for(int i=0;i<arr.length;i++)
        {
            String[] q = arr[i].split(":");
            map.get(q[0]).add(q[1]);
        }
        Iterator<String> iterator = map.keySet().iterator();
        while(iterator.hasNext())
        {
            String key =  iterator.next();
            System.out.println("Question topic  " + key+"\n" );
            for(int i=0;i<map.get(key).toArray().length;i++)
            {
                System.out.println(map.get(key).toArray()[i]+ "\n");
            }
        }
    }
}
