package com.cbt.logisticservicejan24;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/logistic")
public class LogisticsController
{
    @Autowired
    LogisticrfqRepository logisticrfqRepository;
    @Autowired
    LogisticrfqofferRepository logisticrfqofferRepository;
    @Autowired
    LogisticrfqorderRepository logisticrfqorderRepository;

    Logger logger = LoggerFactory.getLogger(LogisticsController.class);

    @PostMapping("save/rfq")
   public ResponseEntity<String> createLogisticRfq(@RequestBody Logisticrfq logisticrfq)
    {
        logisticrfq.setRfqid(String.valueOf((int) (Math.random() * 10000)));
        logisticrfqRepository.save(logisticrfq);
        logger.info("New Logistic RFQ Created");
        return ResponseEntity.ok("New Logistic RFQ Created");
    }

    @PostMapping("save/rfqoffer")
    public ResponseEntity<String> saveRfqOffer( @RequestBody Logisticrfqoffer logisticrfqoffer)
    {
        logisticrfqoffer.setRfqofferid(String.valueOf((int) (Math.random() * 10000)));
        logisticrfqofferRepository.save(logisticrfqoffer);
        logger.info("New RFQ Offer saved");
        return ResponseEntity.ok("New RFQ Offer saved");
    }

    @PostMapping("accept/rfqoffer")
    public ResponseEntity<String> acceptRfqOffer(@RequestBody Logisticrfqorder logisticrfqorder)
    {
        logisticrfqorder.setRfqorderid(String.valueOf((int) (Math.random() * 10000)));
        logisticrfqorderRepository.save(logisticrfqorder);
        logger.info("RFQ Order placed");

        //PAYMENT REALTED LOGIC

        return ResponseEntity.ok("RFQ Order placed");

    }


}
