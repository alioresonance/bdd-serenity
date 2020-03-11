/*
 * **********************************************************
 *  Copyright (c) 2020  Ideanamix, LLC.  All rights reserved.
 * **********************************************************
 */
package tech.ideanamix.qa.steps;

import tech.ideanamix.qa.model.Category;
import tech.ideanamix.qa.ui.CategoryNavigationBar;
import tech.ideanamix.qa.ui.CurrentPage;
import tech.ideanamix.qa.ui.EbayHomePage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class NavigatingUser {

    EbayHomePage ebayHomePage;
    CurrentPage currentPage;
    CategoryNavigationBar categoryNavigationBar;

    @Step
    public void isOnTheHomePage() {
        ebayHomePage.open();
    }

    @Step
    public void navigatesToCategory(Category category) {
        categoryNavigationBar.selectCategory( category );
    }

    @Step
    public void shouldSeePageTitleContaining(String expectedTitle) {
        assertThat( currentPage.getTitle() ).containsIgnoringCase( expectedTitle );
    }

}
