package (023-21-0249)Moazam_TextFileCompresion;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
public class MainApp {

    public static void main(String[] args) {
	String str = "";
	Scanner s = new Scanner(System.in);
	System.out.print("Give File Location: ");
        String add = s.nextLine();
        Path fileName = Path.of(add+".txt");
        str = Files.readString(fileName);

	Huffman huffman = new Huffman(str);

        String encodedText = huffman.encode();
        System.out.println(encodedText);

        huffman.printCodes();

        String originalText = huffman.decode(encodedText);
        System.out.println(originalText);

    }

}