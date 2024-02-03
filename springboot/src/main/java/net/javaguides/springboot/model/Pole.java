package net.javaguides.springboot.model;

import jakarta.persistence.*;

@Entity
@Table(name = "gopi")
public class Pole {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long poleid;
	
	@Column(name = "pole_material")
	private String pole_material;

	@Column(name = "pole_lat")
	private Double pole_lat;
	
	@Column(name = "pole_lon")
	private Double pole_lon;
	
	@Column(name = "pole_remarks")
	private String pole_remarks;
	
	
	public Pole() {
		
	}
	
	public Pole(long poleid ,String pole_material, Double pole_lat, Double pole_lon,String pole_remarks) {
		super();
		this.poleid = poleid;
		this.pole_material = pole_material;
		this.pole_lat = pole_lat;
		this.pole_lon = pole_lon;
		this.pole_remarks = pole_remarks;
	}
	public long getpoleid() {
		return poleid;
	}
	public void setpoleid(long poleid) {
		this.poleid = poleid;
	}
	public String getpole_material() {
		return pole_material;
	}
	public void setpole_material(String pole_material) {
		this.pole_material = pole_material;
	}
	public Double getpole_lat() {
		return pole_lat;
	}
	public void setpole_lat(Double pole_lat) {
		this.pole_lat = pole_lat;
	}
	public Double getpole_lon() {
	return pole_lon;
}
	public void setpole_lon(Double pole_lon) {
		this.pole_lon = pole_lon;
	}
	
	public String getpole_remarks() {
		return pole_remarks;
	}
	public void setpole_remarks(String pole_remarks) {
		this.pole_remarks = pole_remarks;
	}

	
	
	

}