package webapp.econnect.poSs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class POSservice { //Business service
	
	
	private List<POS> poss = new ArrayList<>(Arrays.asList( //List of poses
			new POS("03759", "Spectra", "Ready to market"),
			new POS("39745", "Jpax", "Problemed"),
			new POS("39357", "Jpax", "Ready to market")
			));
	
	public List<POS> getAllPos(){ //GET all poses
		return poss;
	}
	
	public POS getPOS(String serial) { //GET a specific pos
		return poss.stream().filter(t -> t.getSerialNumber().equals(serial)).findFirst().get();
	}
	
	public void addPOS(POS pos) { //PUT new pos
		poss.add(pos);
	}

	public void updatePOS(String serial, POS pos) {
		for (int i = 0; i< poss.size(); i++) {
			POS t = poss.get(i);
			if(t.getSerialNumber().equals(serial)) {
				poss.set(i,pos);
				return;
			}
		}
		
	}

	public void deletePOS(String serial) {
		poss.removeIf(t -> t.getSerialNumber().equals(serial));
		
	}
}
