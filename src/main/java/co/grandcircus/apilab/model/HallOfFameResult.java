package co.grandcircus.apilab.model;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HallOfFameResult {
	
	private List<CoolPerson> complete;
	private List<AbbrCoolPerson> tiny;
	
	public List<CoolPerson> getComplete() {
		return complete;
	}
	
	public List<CoolPerson> getCompleteOrderByDate() {
		List<CoolPerson> sortedCoolPersons = complete.stream()
				  .sorted(Comparator.comparing(CoolPerson::getYear))
				  .collect(Collectors.toList());
		return sortedCoolPersons;
	}
	
	public void setComplete(List<CoolPerson> complete) {
		this.complete = complete;
	}
	
	public List<AbbrCoolPerson> getTiny() {
		return tiny;
	}
	
	public List<AbbrCoolPerson> getTinyOrderByDate() {
		List<AbbrCoolPerson> sortedAbbrCoolPersons = tiny.stream()
				.sorted(Comparator.comparing(AbbrCoolPerson::getYear))
				.collect(Collectors.toList());
		return sortedAbbrCoolPersons;
	}
	
	public void setTiny(List<AbbrCoolPerson> tiny) {
		this.tiny = tiny;
	}
	@Override
	public String toString() {
		return "HallOfFameResult [complete=" + complete + ", tiny=" + tiny + "]";
	}
	
}
