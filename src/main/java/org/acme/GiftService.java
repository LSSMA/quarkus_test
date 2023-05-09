package org.acme;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class GiftService {
  @Inject
  EntityManager em;

  @Transactional
  public void createGift(String giftDescription) {
    Giftla gift = new Giftla();
    gift.setName(giftDescription);
    em.persist(gift);
  }
}
