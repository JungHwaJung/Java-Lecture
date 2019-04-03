package basic03;

import java.util.List;

public class EaglesTest {

	public static void main(String[] args) {
		EaglesDAO eDao = new EaglesDAO();
		
		/*eDao.insertPlayer(new EaglesDTO(39, "김민하", "외야수", "경남고", "오른손", "왼손", "0225", 100000));
		EaglesDTO player = eDao.selectOne(39);
		System.out.println(player.toString());*/
		/*EaglesDTO player = eDao.selectOne(39);	update
		player.setIncome(200000000);
		System.out.println(player.toString());
		
		eDao.deletePlayer(5);		
		List<EaglesDTO> playerList = eDao.selectAll();*/
		
		/*List<EaglesDTO> playerList = eDao.selectPlayers();
		System.out.println("연봉 3억원 이상 선수 명단");
		for( EaglesDTO eagle : playerList) {
			System.out.println(eagle.toString());
		}*/
		
		String positions[] = {"투수", "포수", "내야수", "외야수"};
		for(String position : positions) {
			List<EaglesDTO> playerList = eDao.selectPlayersByPosition(position);
			System.out.println("포지션이 " + position + "인 선수 명단");
			for( EaglesDTO eagle : playerList) {
				System.out.println(eagle.toString());
			}
			System.out.println();
		}
		System.out.println("연봉 2억원 이상 선수 명단");
		List<EaglesDTO> playerList = eDao.selectPlayersByIncome(200000000);
		for( EaglesDTO eagle : playerList) {
			System.out.println(eagle.toString());
		}
		eDao.close();
	}
}
