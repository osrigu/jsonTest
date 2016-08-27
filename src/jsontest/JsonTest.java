/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsontest;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class JsonTest 
{
    public static void main( String[] args) throws Exception 
    {

        File f =new File("json.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        System.out.println("file read");
        ANTLRInputStream input = new ANTLRInputStream(br);

        JSONLexer lexer = new JSONLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        JSONParser parser = new JSONParser(tokens);
        ParseTree tree = parser.start(); // begin parsing at rule 'r'
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree
    }
}
