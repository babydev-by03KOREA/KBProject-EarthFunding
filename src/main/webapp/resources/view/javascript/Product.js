function amount() {
    let labor = document.querySelector('.labor').value;
    let tools = document.querySelector('.tools').value;
    let policy = document.querySelector('.policy').value;

    let parsLabor = parseInt(labor);
    let parsTools = parseInt(tools);
    let parsPolicy = parseInt(policy);

    let amount = parsLabor + parsTools + parsPolicy;
    confirm(amount + "₩이 기부됩니다.");
}
