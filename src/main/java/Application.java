import domain.Menu;
import domain.MenuRepository;
import domain.Table;
import domain.TableRepository;
import view.InputView;
import view.OutputView;

import java.util.List;

public class Application {
    // TODO 구현 진행
    public static void main(String[] args) {
        // 메인 화면 출력
        int mainNumber = InputView.inputMainNumber();

        // 테이블 번호 출력
        final List<Table> tables = TableRepository.tables();
        OutputView.printTables(tables);

        final int tableNumber = InputView.inputTableNumber();

        // 메뉴 번호 출력
        final List<Menu> menus = MenuRepository.menus();
        OutputView.printMenus(menus);


    }
}
