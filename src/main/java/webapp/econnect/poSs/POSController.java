package webapp.econnect.poSs;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class POSController {

	@Autowired
	private POSservice posService; //Dependency injection
	
	@RequestMapping("/poss") //GET all POSs
	public List<POS> getAllPos() {
		return posService.getAllPos();
	}
	
	@RequestMapping("/poss/{serial}") //GET specific POS
	public POS getPOS (@PathVariable String serial) {
		return posService.getPOS(serial);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/poss") //POST new POS
	public void addPOS (@RequestBody POS pos) {
		posService.addPOS(pos);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/poss/{serial}") //Update POS
	public void updatePOS (@PathVariable String serial,@RequestBody POS pos) {
		posService.updatePOS(serial, pos);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/poss/{serial}") //Delete POS
	public void deletePOS (@PathVariable String serial) {
		posService.deletePOS(serial);
	}
	
	
}
