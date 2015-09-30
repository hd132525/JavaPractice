package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MelonGenreChart {
	public static void printMap(Map<String, List<Music>> map) {
		for(Map.Entry<String, List<Music>> set : map.entrySet()) {
			System.out.println("[" + set.getKey() + "]");
			for(int i=0; i<set.getValue().size(); i++) {
				System.out.println((i+1) + ". " + set.getValue().get(i).toString());
			}
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		Map<String, List<Music>> map = new HashMap<String, List<Music>>();
		List<Music> ballad = new ArrayList<Music>();
		List<Music> dance = new ArrayList<Music>();
		ballad.add(new Music("내 첫사랑", "김현성"));
		ballad.add(new Music("머나먼 내 고향", "김민준"));
		ballad.add(new Music("He is Gosling", "최수범"));
		dance.add(new Music("버리는 남자", "김정현"));
		dance.add(new Music("난 파이선이 아주 좋아", "건박"));
		map.put("발라드", ballad);
		map.put("댄스", dance);
		
		System.out.println("-------- <<멜론 장르별 차트>> --------");
		printMap(map);
		
		ballad.set(2, new Music("기분이 정말 좋은 하루", "김준성"));
		map.put("발라드", ballad);
		
		System.out.println("-------- <<발라드 3위 곡 변경>> --------");
		printMap(map);
		
		ballad.remove(0);
		map.put("발라드", ballad);
		
		System.out.println("-------- <<발라드 1위 곡 삭제>> --------");
		printMap(map);
		
		ballad.clear();
		dance.clear();
		map.clear();
		System.out.println("-------- <<전체 리스트 삭제>> --------");
		printMap(map);
	}
}
