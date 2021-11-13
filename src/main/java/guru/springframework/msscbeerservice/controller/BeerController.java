package guru.springframework.msscbeerservice.controller;

import guru.springframework.msscbeerservice.model.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping("/{beerId}")
    public BeerDto getBeer(@PathVariable UUID beerId){
        return BeerDto.builder().build();
    }

    @PostMapping
    public ResponseEntity<BeerDto> create(@RequestBody BeerDto beerDto){
        return new ResponseEntity<>(beerDto, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable UUID beerId, @RequestBody @Valid BeerDto beerDto){
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable UUID beerId){
    }

}
