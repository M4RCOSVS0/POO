package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entieties.Comment;
import entieties.Post;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome");

        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", "I'm going to visit wonderful coutry!",12);

        p1.addComment(c1);
        p1.addComment(c2);
        
        System.out.println("BOM VIU");
        System.out.println(p1);
    }
    

    
}
