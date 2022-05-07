module oocprjcts {
	public class ooc1 {
		class plane{
			void takeoff() {
				System.out.println("plane take-off");
			}
			void fly() {
				System.out.println("plane flys");
			}
			void land() {
				System.out.println("plane lands");
			}
		}
		class cargoplane extends plane{
			//@override
			void fly() {
				System.out.println("cargo plane flies at lower height");
			}
			//specialized method of cargoplane
			void carrygoods() {
				System.out.println("cargo plane carry goods");
			}
		}
		class fighterplane extends plane{
			//@override
			void fly() {
				System.out.println("fighterplane flies at greater height");
			}
			//specialized method of fighterplane
			void carryweapons() {
				System.out.println("fighterplane carry weapons");
			}
		}
		class pasengerplane extends plane{
			//@override
			void fly() {
				System.out.println("pasengerplane flies at medium height");
			}
			//specialized method of pasengerplane
			void carrypassengers() {
				System.out.println("pasengerplane carry passengers");
			}
		}
		public class plane {
			public static void main(String[] args) {
				cargoplane cp = new cargoplane();
				System.out.println("cargoplane details:");
				cp.takeoff();
				cp.fly();
				cp.land();
				cp.carrygoods();
				System.out.println("--------------------------------------");
				
				fighterplane cp = new fighterplane();
				System.out.println("fighterplane details:");
				cp.takeoff();
				cp.fly();
				cp.land();
				cp.carryweapons();
				System.out.println("--------------------------------------");
				
				passengerplane cp = new passengerplane();
				System.out.println("passengerplane details:");
				cp.takeoff();
				cp.fly();
				cp.land();
				cp.carrypassengers();
				System.out.println("--------------------------------------");

			}

		}

	}

}