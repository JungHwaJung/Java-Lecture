package sec08;

import java.util.StringTokenizer;

public class EX1 {

	public static void main(String[] args) {
		String text = "C:\\Program Files (x86)\\Common Files\\Oracle\\Java\\javapath;%SystemRoot%\\system32;%SystemRoot%;%SystemRoot%\\System32\\Wbem;%SYSTEMROOT%\\System32\\WindowsPowerShell\\v1.0\\;C:\\Program Files\\Common Files\\Autodesk Shared\\;C:\\Program Files (x86)\\Autodesk\\Backburner\\;%JAVA_HOME%\\bin;C:\\Program Files\\Git\\cmd";
		StringTokenizer st = new StringTokenizer(text, ";");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
