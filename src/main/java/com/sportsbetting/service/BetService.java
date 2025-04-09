package com.sportsbetting.service;

import com.sportsbetting.model.Bet;
import com.sportsbetting.repository.BetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BetService {

    @Autowired
    private BetRepository betRepository;

    @Cacheable(value = "bets")
    public List<Bet> getAllBets() {
        return betRepository.findAll();
    }

    public Bet placeBet(Bet bet) {
        return betRepository.save(bet);
    }
}

