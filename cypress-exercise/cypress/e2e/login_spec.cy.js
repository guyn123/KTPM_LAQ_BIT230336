describe('Login Test', () => {
    // Chạy trước mỗi test case trong file này
    beforeEach(() => {
        cy.visit('https://www.saucedemo.com');
    });

    it('Kịch bản 1: Đăng nhập thành công với tài khoản hợp lệ', () => {
        cy.get('#user-name').type('standard_user');
        cy.get('#password').type('secret_sauce');
        cy.get('#login-button').click();

        // Kiểm tra URL có chuyển hướng đúng không
        cy.url().should('include', '/inventory.html');
    });

    it('Kịch bản 2: Thông báo lỗi khi đăng nhập sai', () => {
        cy.get('#user-name').type('invalid_user');
        cy.get('#password').type('wrong_password');
        cy.get('#login-button').click();

        // Kiểm tra thông báo lỗi
        cy.get('.error-message-container')
            .should('be.visible')
            .and('contain', 'Username and password do not match');
    });
});