accounts = []

def transfer(source: int, destination: int, amount: int) -> None:
    # Step 1 - Get source account
    source_account = get_account(source)

    # Step 2 - Update source account
    update_account(source_account, -amount)

    # Step 3 - Get destination account
    dest_account = get_account(destination)

    # Step 4 - Credit destination account
    update_account(dest_account, amount)

def get_account(id: int) -> dict:
    return list(filter(lambda account: account['id'] == id, accounts))[0]

def update_account(account: dict, delta: int) -> None:
    account['balance'] += delta

if __name__ == "__main__":
    accounts.append({'id': 1, 'name': 'Alice', 'balance': 500})
    accounts.append({'id': 2, 'name': 'Bob', 'balance': 1000})

    print(accounts)
    transfer(1, 2, 500)
    print(accounts)

