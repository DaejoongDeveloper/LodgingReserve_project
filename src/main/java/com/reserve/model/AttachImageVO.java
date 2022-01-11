package com.reserve.model;

public class AttachImageVO {
	
	private int lodgingId;
	
	private String uploadPath;
	
	private String uuid;
	
	private String fileName;
	
	public int getLodgingId() {
		return lodgingId;
	}

	public void setLodgingId(int lodgingId) {
		this.lodgingId = lodgingId;
	}
	
	public String getUploadPath() {
		return uploadPath;
	}

	public void setUploadPath(String uploadPath) {
		this.uploadPath = uploadPath;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	

	@Override
	public String toString() {
		return "AttachImageVO [uploadPath=" + uploadPath + ", uuid=" + uuid + ", fileName=" + fileName + ", lodgingId="
				+ lodgingId + "]";
	}
	
	
}
