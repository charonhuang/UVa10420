import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Nation> nation_coll = new LinkedList<Nation>();
		Scanner sc = new Scanner(System.in);
		
		int nLine = sc.nextInt();
		
		for(int i = 0; i < nLine; i++)
		{
			String name;
			
			name = sc.next();
			sc.nextLine();
			Nation aNation; //reference 參照 參考 變數
			
			if(nation_coll.isEmpty())
			{
				aNation = new Nation(name, 1);
				nation_coll.add(aNation);
			}
			else
			{
				boolean isExisted = false; 
				
				for(int idx = 0; idx < nation_coll.size(); idx++)
				{
					Nation currNation = nation_coll.get(idx);
					if(name.compareTo(currNation.getName()) < 0)
					{
						aNation = new Nation(name, 1);
						nation_coll.add(idx, aNation);
						isExisted = true;
						break;
					}
					else if(name.compareTo(currNation.getName()) == 0)
					{
						int currCount = currNation.getCount();
						currCount++;
						currNation.setCount(currCount);
						nation_coll.set(idx, currNation);
						isExisted = true;
						break;
					}
				}
				
				if(!isExisted)
				{
					aNation = new Nation(name, 1);
					nation_coll.add(aNation);
				}
			}
			//System.out.println(name);
		}
		
		for (int j = 0; j < nation_coll.size(); j++) {
			Nation aNation = nation_coll.get(j);
			System.out.print(aNation.getName());
			System.out.print(" ");
			System.out.println(aNation.getCount());
		}

		sc.close();
	}

}
