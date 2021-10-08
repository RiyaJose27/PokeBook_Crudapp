package com.codingdojo.poke.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="pokes")
public class Poke {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
	
   
   @NotNull
   @Size(min=5, max=150, message = "Need size to be 5 to 150")
   private String expense;
   
   @NotNull
   @Size(min=5, max=150, message="minimum 5 character is needed" )
   private String vendor;
   
   
   @NotNull
   @Size(min=5, max=150, message="minimum 5 character is needed" )
   private String description;
   
   
   @NotNull
   @Min(value=5, message ="amount is needed")
   private int amount;
   
   
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
   
   @DateTimeFormat(pattern="yyyy-MM-dd")
   private Date updatedAt;
   
   
   public Poke () {}
   
   
 





public Poke(@NotNull @Size(min = 5, max = 150, message = "Need size to be 5 to 150") String expense,
		@NotNull @Size(min = 5, max = 150, message = "minimum 5 character is needed") String vendor,
		@NotNull @Size(min = 5, max = 150, message = "minimum 5 character is needed") String description,
		@NotNull @Min(value = 5, message = "amount is needed") int amount) {
	super();
	this.expense = expense;
	this.vendor = vendor;
	this.description = description;
	this.amount = amount;
}








public long getId() {
	return id;
}








public void setId(long id) {
	this.id = id;
}








public String getExpense() {
	return expense;
}








public void setExpense(String expense) {
	this.expense = expense;
}








public String getVendor() {
	return vendor;
}








public void setVendor(String vendor) {
	this.vendor = vendor;
}








public String getDescription() {
	return description;
}








public void setDescription(String description) {
	this.description = description;
}








public int getAmount() {
	return amount;
}








public void setAmount(int amount) {
	this.amount = amount;
}








public Date getCreatedAt() {
	return createdAt;
}








public void setCreatedAt(Date createdAt) {
	this.createdAt = createdAt;
}








public Date getUpdatedAt() {
	return updatedAt;
}








public void setUpdatedAt(Date updatedAt) {
	this.updatedAt = updatedAt;
}








// other getters and setters removed for brevity
   @PrePersist
   protected void onCreate(){
       this.createdAt = new Date();
   }
   @PreUpdate
   protected void onUpdate(){
       this.updatedAt = new Date();
   
   
   
   }
}
