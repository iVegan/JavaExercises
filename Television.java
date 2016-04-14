public class Television {

		public int channel;
		public int volume;
		public boolean on;
		
		public Television(int channel, int volume, boolean on) {
			this.channel = channel;
			this.volume = volume;
			this.on = on;					
		}
		public void turnOn() {
			on = true;
		}
		public void turnOff() {
			on = false;
		}
        public void setChannel(int c) {
            if(on = true){
            	channel = c;
            }
        }
        public void setVolume(int v) {
            if(on = true) {
            	volume = v;
            }
        }
        public void channelUp() {
        	if(on = true){
        		channel++;
        	}
        }
        public void channelDown() {
        	if(on = true){
        		channel--;
        	}
        }
        public void volumeUp() {
        	if(on = true){
        		volume++;
        	}
        }
        public void volumeDown() {
        	if(on = true){
        		volume--;
        	}
        }

}
