import java.io.*; 
 
class Player implements Serializable{ 
    String name; 
    int Runs; 
 
    Player(String name, int Runs) { 
        this.name = name; 
        this.Runs = Runs; 
 
    } 
 
    public String getname() { 
        return name; 
    } 
 
    public void setname(String name) { 
        this.name = name; 
    } 
 
    public int getRuns() { 
        return Runs; 
    } 
 
    public void setRuns(int Runs) { 
        this.Runs = Runs; 
    } 
 
    public String toString() { 
        return name + " " + Runs; 
    } 
} 
 
class Playerlist { 
    public static void main(String args[]) { 
		try{
			Player P1, P2, P3, P4, P5, P6; 
			P1 = new Player("sachin", 18000); 
			P2 = new Player("Rohit", 17000); 
			P3 = new Player("Dhoni", 15000); 
			P4 = new Player("virat", 16000); 
			P5 = new Player("kapil", 1900); 
			P6 = new Player("jedeja", 14000); 
			File f=new File("Player.dat");
			FileOutputStream fos=new FileOutputStream(f);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(P1);
			oos.writeObject(P2);
			oos.writeObject(P3);
			oos.writeObject(P4);
			oos.writeObject(P5);
			oos.writeObject(P6);
			oos.close();
			
			FileInputStream fis=new FileInputStream(f);
			ObjectInputStream ois=new ObjectInputStream(fis);
			while(true){
				try{
					Player p=(Player) ois.readObject();
					System.out.println(p);
				}
				catch(Exception e){
					break;
				}
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		
        /*TreeSet<Player> ts1 = new TreeSet<>(Comparator.comparing(Player::getname)); 
        ts1.add(P1); 
        ts1.add(P2); 
        ts1.add(P3); 
        ts1.add(P4); 
        ts1.add(P5); 
        ts1.add(P6); 
        TreeSet<Player> ts2 = new TreeSet<>(Comparator.comparing(Player::getRuns)); 
        ts2.add(P1); 
        ts2.add(P2); 
        ts2.add(P3); 
        ts2.add(P4); 
        ts2.add(P5); 
        ts2.add(P6); 
        System.out.println("Sorted lists based on runs"); 
        for (Player P : ts2) { 
            System.out.println(P); 
        } 
        System.out.println("Sorted lists based on Name"); 
        for (Player P : ts1) { 
            System.out.println(P); 
        } 
        int totalRuns = 0; 
        for (Player player : ts2) { 
            totalRuns += player.getRuns(); 
        } 
 
        double averageRuns = (double) totalRuns / ts2.size(); 
        System.out.println("Average Runs: " + averageRuns); */
		
    } 
}