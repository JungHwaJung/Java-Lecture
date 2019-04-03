package exercise;

import java.util.List;
import java.util.Scanner;

public class MemberApplication {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		MemberDAO mDao = new MemberDAO();
		boolean run = true;
		while(run) {
			System.out.println("----------------------------------------------------------------");
			System.out.println("1.가입 | 2.조회 | 3.변경 | 4.삭제 | 5.검색 | 6.아이디확인 | 7.종료");
			System.out.println("----------------------------------------------------------------");
			System.out.print("선택 > ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {
				System.out.print("패스워드 > ");
				String pass = sc.nextLine();
				System.out.print("이름 > ");
				String name = sc.nextLine();
				System.out.print("생일 > ");
				String birthday = sc.nextLine();
				System.out.print("주소 > ");
				String address = sc.nextLine();
				
				mDao.insertMember(new MemberDTO(pass, name, birthday, address));
				System.out.println(mDao.toString());
				
			} else if(selectNo == 2) {
				List<MemberDTO> memberList = mDao.selectAll();
				System.out.println(memberList.toString());
				
			} else if(selectNo == 3) {
				System.out.print("변경할 ID > ");
				int id = Integer.parseInt(sc.nextLine());
				MemberDTO mDto = mDao.selectOne(id);
				
				System.out.print("패스워드 > ");
				String pass = sc.nextLine();
				
				System.out.print("이름 > ");
				String name = sc.nextLine();
				
				System.out.print("생일 > ");
				String birthday = sc.nextLine();
				
				System.out.print("주소 > ");
				String address = sc.nextLine();

				mDto.setPassword(pass);
				mDto.setName(name);
				mDto.setBirthday(birthday);
				mDto.setAddress(address);
				
				mDao.updateMember(mDto);
				System.out.println(mDto.toString());
				
			} else if(selectNo == 4) {
				System.out.print("삭제할 ID > ");
				mDao.deleteMember(sc.nextInt());
				
				System.out.println(mDao.toString());
				
			} else if(selectNo == 5) {
				System.out.print("검색할 이름 > ");
				String name = sc.nextLine();
				List<MemberDTO> memberList = mDao.searchMemberByName(name);
				for( MemberDTO eagle : memberList) {
					System.out.println(eagle.toString());
				}
			} else if(selectNo == 6) {
				System.out.print("아이디입력 > ");
				int id = Integer.parseInt(sc.nextLine());
				MemberDTO mDto = mDao.selectOne(id);
				
				System.out.print("패스워드입력 > ");
				String pass = sc.nextLine();
				
				if(mDto.getPassword().equals(pass)) {
					System.out.println("아이디가 맞습니다.");
				} else {
					System.out.println("아이디가 틀렸습니다.");
				}
			} else if(selectNo == 7) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
}
