package com.javaex.ex07;

public class TV {

	//필드
	private int channel;
	private int volume;
	private boolean power;
	//생성자
	
	public TV() {
	}
	
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = false;
		
	}
	//메소드 g/s
	public int channel() {
		
		return channel;
	}

	
	public int getVolume() {
		
		return volume;
	}
		
	public boolean isPower() {
		return power;
	}
	
	//메소드 일반
	public void status(){
		
		System.out.println(channel+","+volume+","+power);
		
	}
	
	public void  volume(int volume) {
		
		if(volume>100) {
			this.volume=100;
		}else if(volume<0) {
			this.volume=0;
		}else {
			this.volume=volume;
		}
	}
	
	
	public void power (boolean power) {
		this.power=power;
		
	}

	
	@Override
	public String toString() {
		return "TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}
}
