package MessageFormat;

import java.text.MessageFormat;

public class MessageFormatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "java";
		String name = "hotteok";
		String tel = "010-0000-0000";
		
		String text = "member id: {0} \nmember name: {1} \nmember tel: {2}";
		String result = MessageFormat.format(text, id, name, tel);
		System.out.println(result);
	
		String sql = "insert into member values( {0}, {1}, {2} )";
		Object[] arguments = { "'java'", "'hotteok'", "'010-0000-0000'" };
		String result2 = MessageFormat.format(sql, arguments);
		System.out.println(result2);
		
		String result3 = String.format("%d %s : %.2f", 1, "avg", 1234.1234);
		System.out.println(result3);
			
	}

}
