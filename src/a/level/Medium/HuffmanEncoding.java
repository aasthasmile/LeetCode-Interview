/**
 * 
 */
package a.level.Medium;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;

/**
 * The idea is to assign variable-length codes to input characters, lengths of
 * the assigned codes are based on the frequencies of corresponding characters.
 * The most frequent character gets the smallest code and the least frequent
 * character gets the largest code.
 */
class HuffmanTree implements Comparable<HuffmanTree> {
	char ch;
	int frequency;
	HuffmanTree right;
	HuffmanTree left;

	public HuffmanTree(char ch, int freq) {
		this.ch = ch;
		this.frequency = freq;
	}

	@Override
	public int compareTo(HuffmanTree obj) {
		return this.frequency - obj.frequency;
	}

}

public class HuffmanEncoding {
	public static void main(String[] args) {
		PriorityQueue<HuffmanTree> htree = new PriorityQueue<>();
		Scanner sc = new Scanner(System.in);
		int Testcases = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < Testcases; i++) {
			String[] characters = sc.nextLine().split("");
			char[] ch = new char[characters.length];
			int[] freq = new int[characters.length];
			for (int j = 0; j < freq.length; j++) {
				htree.add(new HuffmanTree(characters[j].charAt(0), sc.nextInt()));
			}
			int random = 199;
			while (htree.size() > 1) {
				HuffmanTree h1 = htree.poll();
				HuffmanTree h2 = htree.poll();

				HuffmanTree inNode = new HuffmanTree('#', h1.frequency + h2.frequency);
				inNode.left = h1;
				inNode.right = h2;
				htree.add(inNode);
			}

			// pre-order Traversal to print huffman code and its value
			printhuffmancode(htree.poll(), "");
		}
	}

	public static void printhuffmancode(HuffmanTree htree, String freq) {
		if (htree == null)
			return;
		if (htree.ch != '#')
			System.out.println(htree.ch + ":" + freq);
		printhuffmancode(htree.left, freq + "0");
		printhuffmancode(htree.right, freq + "1");
		
	}

}
