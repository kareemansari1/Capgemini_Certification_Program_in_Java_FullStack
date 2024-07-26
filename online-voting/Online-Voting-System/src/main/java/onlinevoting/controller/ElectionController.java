package onlinevoting.controller;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/election")
@CrossOrigin(origins = "http://localhost:4200")
public class ElectionController {
/*@Autowired
   private ElectionService electionService;
   @PostMapping("/add")
   public String addElection(@RequestBody Election election) {
       electionService.addElection(election);
       return "Election added successfully";
   }

    @GetMapping("/electionlist")
  public List<Election> getAllElections() {
        return electionService.getAllElections();
    }
       @GetMapping("/findById/{electionId}")
    public Optional<Election> getElectionById(@PathVariable Long electionId) {  // optional is for avoiding null pinterexception in case u dont get any records.
        return electionService.getElectionById(electionId);
    }
    @GetMapping("/findByName/{electionName}")
    public List<Election> getElectionByName(@PathVariable String electionName) {
        return electionService.getElectionByName(electionName);
    }

    @GetMapping("/findByDate/{electionDate}")
   public List<Election> getElectionByDate(@PathVariable String electionDate) {
       // Parse the date from the path variable and pass it to the service        return electionService.getElectionByDate(LocalDate.parse(electionDate));
   }

   @DeleteMapping("/deleteelection/{electionId}")
   public String deleteElectionById(@PathVariable Long electionId) {
       electionService.deleteElectionById(electionId);
       return "Election deleted successfully";
    }
    */
    
    @GetMapping("/electionenddate")
    public String getElectionEndDate() {
        return "Jul 25, 2024";
    }

}
