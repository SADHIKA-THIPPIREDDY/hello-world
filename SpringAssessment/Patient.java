package com.example.demo;

public class Patient {
	private int patientid;
	private String patientName;
	private double patientHeight;
	private double patientWeight;
	private BMICalculator bmicalculator;
	public Patient() {}
	public BMICalculator getBmicalculator() {
		return bmicalculator;
	}
	public void setBmicalculator(BMICalculator bmicalculator) {
		//System.out.println("inside bmicalc");
		this.bmicalculator = bmicalculator;
	}
	public Patient(int patientid, String patientName, double patientHeight, double patientWeight) {
		super();
		this.patientid = patientid;
		this.patientName = patientName;
		this.patientHeight = patientHeight;
		this.patientWeight = patientWeight;
	}
	public void getPatientid() {
		System.out.println("patient id is..>"+patientid);
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	public void getPatientName() {
		System.out.println("patient name is..>"+patientName);
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public void getPatientHeight() {
		System.out.println("patient height is..>"+patientHeight);
	}
	public void setPatientHeight(double patientHeight) {
		this.patientHeight = patientHeight;
	}
	public void getPatientWeight() {
		System.out.println("patient weight is..>"+patientWeight);
	}
	public void setPatientWeight(double patientWeight) {
		this.patientWeight = patientWeight;
	}
	public void calculate() {
		System.out.println(bmicalculator.calculateBMI(patientWeight,  patientHeight));
	}

	}
