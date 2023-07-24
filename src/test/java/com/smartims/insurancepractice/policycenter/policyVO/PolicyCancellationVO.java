package com.smartims.insurancepractice.policycenter.policyVO;

public class PolicyCancellationVO {
	String policyCancellationSource;
	String policyCancellationReason;
	String policyCancellationReasonDescription;
	String cancellationEffectiveDate;
	String policyCancellationBindOptions;

	public String getPolicyCancellationSource() {
		return policyCancellationSource;
	}

	public void setPolicyCancellationSource(String policyCancellationSource) {
		this.policyCancellationSource = policyCancellationSource;
	}

	public String getPolicyCancellationReason() {
		return policyCancellationReason;
	}

	public void setPolicyCancellationReason(String policyCancellationReason) {
		this.policyCancellationReason = policyCancellationReason;
	}

	public String getPolicyCancellationReasonDescription() {
		return policyCancellationReasonDescription;
	}

	public void setPolicyCancellationReasonDescription(String policyCancellationReasonDescription) {
		this.policyCancellationReasonDescription = policyCancellationReasonDescription;
	}

	public String getCancellationEffectiveDate() {
		return cancellationEffectiveDate;
	}

	public void setCancellationEffectiveDate(String cancellationEffectiveDate) {
		this.cancellationEffectiveDate = cancellationEffectiveDate;
	}

	public String getPolicyCancellationBindOptions() {
		return policyCancellationBindOptions;
	}

	public void setPolicyCancellationBindOptions(String policyCancellationBindOptions) {
		this.policyCancellationBindOptions = policyCancellationBindOptions;
	}

}
