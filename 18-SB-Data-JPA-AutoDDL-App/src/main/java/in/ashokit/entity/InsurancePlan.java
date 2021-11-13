package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "INSURANCE_PLANS")
public class InsurancePlan {

	@Id
	@SequenceGenerator(name = "plan_seq", sequenceName = "plan_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "plan_seq", strategy = GenerationType.SEQUENCE)
	@Column(name = "PLAN_ID")
	private Integer planId;

	@Column(name = "PLAN_NAME")
	private String planName;

	@Column(name = "PREMIUM_AMT")
	private Double premiumAmt;

	public InsurancePlan() {
		// TODO Auto-generated constructor stub
	}

	public InsurancePlan(String planName, Double premiumAmt) {
		this.planName = planName;
		this.premiumAmt = premiumAmt;
	}

	public Integer getPlanId() {
		return planId;
	}

	public void setPlanId(Integer planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public Double getPremiumAmt() {
		return premiumAmt;
	}

	public void setPremiumAmt(Double premiumAmt) {
		this.premiumAmt = premiumAmt;
	}

	@Override
	public String toString() {
		return "InsurancePlan [planId=" + planId + ", planName=" + planName + ", premiumAmt=" + premiumAmt + "]";
	}

}
