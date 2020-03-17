package overriding;



 class car {

	
	
	 private String geekName; 
	    private int geekRoll; 
	    private int geekAge;
		public String getGeekName() {
			return geekName;
		}

		public void setGeekName(String Name) {
		geekName = Name;
		}

		public int getGeekRoll() {
			return geekRoll;
		}

		public void setGeekRoll(int geekRoll) {
			this.geekRoll = geekRoll;
		}

		public int getGeekAge() {
			return geekAge;
		}

		public void setGeekAge(int geekAge) {
			this.geekAge = geekAge;
		}

		public void printn(int n,String r)
		{
			System.out.println("***Integer= "+n+"****String is = "+r);
			
		}
		
		public void printn(String w,String q,String y)
		{
			
			
			System.out.println(w+" "+q+" "+" "+y);
		}
		
		public void printn(String wr,String rw)
		{
			System.out.println("*****"+wr+"******"+rw);
			
		}		}
		class B extends car{
			
			
		public	void printn(String wr,String rw)
			{
				System.out.println("************welcome to child "+wr+" "+rw);
			}
			
		
		
		public static void main(String args[])
		{
			
			
			
			car r = new car();car w =new car();
			car q =new B();
						r.printn("stella","lina","mina");
						
						r.printn("lina","mina");
						q.printn("******jawani*****","*********diwani******");
						w.printn("sita","gita");
						
						
						r.setGeekAge(25);System.out.println("Age: "+r.getGeekAge());
						r.setGeekName("mina");System.out.println("Name: "+r.getGeekName());
						r.setGeekRoll(50);System.out.println("Roll : "+r.getGeekRoll());
		}	}
		
		
	

