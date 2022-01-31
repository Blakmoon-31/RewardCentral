package rewardCentral.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import rewardCentral.RewardCentral;

@RestController
public class RewardCentralController {

	private RewardCentral rewardCentral = new RewardCentral();

	@GetMapping("/getRewardPoints")
	public int getAttractionRewardPoints(@RequestParam UUID attractionId, @RequestParam UUID userId) {
		return rewardCentral.getAttractionRewardPoints(attractionId, userId);
	}
}
