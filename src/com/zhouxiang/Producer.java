package com.zhouxiang;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Producer {
	private Product product;
	private Consumer consumer;
	private Semaphore semaphore=new Semaphore(20);
	ReentrantLock lock=new ReentrantLock();
	Condition con=lock.newCondition();
	public Producer(Product product){
		this.product=product;
	}
	public void produce(){
		try {
			semaphore.acquire();
			lock.lock();
			while(product.isFull()){
				con.await();
			}
			product.getProducts().add("aa");
			consumer.getCon().signalAll();
			lock.unlock();
			semaphore.release();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Consumer getConsumer() {
		return consumer;
	}
	public void setConsumer(Consumer consumer) {
		this.consumer = consumer;
	}
	public Semaphore getSemaphore() {
		return semaphore;
	}
	public void setSemaphore(Semaphore semaphore) {
		this.semaphore = semaphore;
	}
	public ReentrantLock getLock() {
		return lock;
	}
	public void setLock(ReentrantLock lock) {
		this.lock = lock;
	}
	public Condition getCon() {
		return con;
	}
	public void setCon(Condition con) {
		this.con = con;
	}

}
