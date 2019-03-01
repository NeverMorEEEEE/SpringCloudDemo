package com.modules.order.entity;

import java.util.Date;

public class Dispatch {
	private String dispatchId;
	private String orderId;
	private String courierId;
	private String courierName;
	private String courierPhone;
	private Date deadLine;
	private String remarks;
	public String getDispatchId() {
		return dispatchId;
	}
	public void setDispatchId(String dispatchId) {
		this.dispatchId = dispatchId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getCourierId() {
		return courierId;
	}
	public void setCourierId(String courierId) {
		this.courierId = courierId;
	}
	public String getCourierName() {
		return courierName;
	}
	public void setCourierName(String courierName) {
		this.courierName = courierName;
	}
	public String getCourierPhone() {
		return courierPhone;
	}
	public void setCourierPhone(String courierPhone) {
		this.courierPhone = courierPhone;
	}
	public Date getDeadLine() {
		return deadLine;
	}
	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		return sb.append("dispatchId : " + dispatchId + ",orderId : " + orderId + ",courierId:" +courierId
				+",courierName:" +courierName+",courierPhone:"+courierPhone+",deadLine:"+deadLine+
				",remarks:"+remarks+"]").toString();
	}
	
	
}
