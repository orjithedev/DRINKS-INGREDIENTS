package ng.edu.binghamuni.depot.Repository;

import ng.edu.binghamuni.depot.Domain.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface DrinkRepository extends JpaRepository<Drink, Long> {
//    @Query("")
//     List<Drink> findDrinkByPriceGreaterThan(int price);
}