import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


public class PalindromeController{
    @PostMapping("/api/v1/checkpalindrome")

    public ResponseEntity<PalindromeResponse>checkpalindrome(@RequestBody PalindromeRequest request){
        String motAverifier = request.getMotAverifier();
        boolean isPalindrome = motAverifier.equalsIngoreCase(new String Builder(motAverifier).reverse().toString())
        if(isPalindrome){
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(new PalindromeResponse(true));
        } else {
            return ResponseEntity.status(HttpStatus.ok).body(new PalindromeResponse(false));
        }
    }
}