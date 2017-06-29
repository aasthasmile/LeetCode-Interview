/**
 * 
 */
package ABGCommunications;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Aastha Jain
 *
 */
public class DecimalToRomanNumeral {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		convertingDecimalToRoman(26);
	}
	
	public static void convertingDecimalToRoman(int number){
		
		Map<Integer, String> map=new LinkedHashMap<Integer,String>();
	
		map.put(1000, "M");
		map.put(900, "CM");
		map.put(500, "D");
		map.put(400, "CD");
		map.put(100, "C");
		map.put(90, "XC");
		map.put(50, "L");
		map.put(40, "XL");
		map.put(10, "X");
		map.put(9, "IX");
		map.put(5, "V");
		map.put(4, "IV");
		map.put(1, "I");
		
		String romanString="";
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			int num=number/entry.getKey();
			if(num>0){
			romanString+=conversion(entry.getValue(),num);
			number=number%entry.getKey();
			}
		}
		
		System.out.println(romanString);
		
	}

	private static String conversion(String value, int num) {
		if(value==null)
			return null;
		
		StringBuilder str=new StringBuilder();
		for(int i=0;i<num;i++){
			str.append(value);
		}
		return str.toString();
	}
	
}
