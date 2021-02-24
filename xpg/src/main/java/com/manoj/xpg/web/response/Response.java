package com.manoj.xpg.web.response;

/**
 * Common response class
 * @author manoj
 *
 */
public class Response {

	private String status;

	private String message;

	private Payload payload;

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the payload
	 */
	public Payload getPayload() {
		return payload;
	}

	/**
	 * @param payload the payload to set
	 */
	public void setPayload(Payload payload) {
		this.payload = payload;
	}
	
	
}
