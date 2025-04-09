package com.sportsbetting.controller;

import com.sportsbetting.model.Bet;
import com.sportsbetting.service.BetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bets")
public class BetController {

    @Autowired
    private BetService betService;

    @GetMapping
    public List<Bet> getAllBets() {
        return betService.getAllBets();
    }

    @PostMapping
    public Bet placeBet(@RequestBody Bet bet) {
        return betService.placeBet(bet);
    }
}

