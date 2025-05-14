package spring.spring_java;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollection {
	List<String> addressList;
	Set<String> addressSet;
	Map<String,String> addressMap;
	Properties addressProp;
	public List<String> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<String> addressList) {
		System.out.println("List Element"+ addressList);
		this.addressList = addressList;
	}
	public Set<String> getAddressSet() {
		System.out.println("Set Element"+ addressSet);
		return addressSet;
	}
	public void setAddressSet(Set<String> addressSet) {
		this.addressSet = addressSet;
	}
	public Map<String, String> getAddressMap() {
		System.out.println("Map Elements "+ addressMap);
		return addressMap;
	}
	public void setAddressMap(Map<String, String> addressMap) {
		
		this.addressMap = addressMap;
	}
	public Properties getAddressProp() {
		System.out.println("Adressprop "+addressProp);
		return addressProp;
	}
	public void setAddressProp(Properties addressProp) {
		this.addressProp = addressProp;
	}
	

}
